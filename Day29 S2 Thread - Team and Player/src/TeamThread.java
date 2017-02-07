public class TeamThread extends Thread {
	Main threadMain;
	Integer numberOfPlayers;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < numberOfPlayers; i++) 
		{
			synchronized (threadMain) 
			{
				threadMain.value=i;
				try 
				{
					threadMain.wait();
				} catch (Exception e) {
					// TODO Auto-generated catch block
				}
				threadMain.notifyAll();
			}
		}
	}

	public Main getThreadMain() {
		return threadMain;
	}

	public void setThreadMain(Main threadMain) {
		this.threadMain = threadMain;
	}

	public Integer getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(Integer numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public TeamThread(Main threadMain, Integer numberOfPlayers) {
		super();
		this.threadMain = threadMain;
		this.numberOfPlayers = numberOfPlayers;

	}
}