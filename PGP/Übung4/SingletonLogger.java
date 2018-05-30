public class SingletonLogger {

	// type of levels
	public static final int ERROR = -1;
	public static final int WARN = 0;
	public static final int INFO = 1;
	public static final int DEBUG = 2;

	private int level;
	private static SingletonLogger instance = null;
	
	 public static SingletonLogger getInstance()
	   {
	      if (instance == null)
	      {
	         instance = new SingletonLogger();
	      }
	      
	      return instance;
	   }
	
	 private SingletonLogger(){
		 
	 }
	 
	public void setLevel(int newLevel) {
		this.level=newLevel;
	}

	public void error(String txt) {
		if (this.level>= -1)
		System.out.println("ERROR: "+ txt);
		
	}

	public void warning(String txt) {
		if (this.level>= 0)
		System.out.println("WARNING: "+ txt);
	}

	public void info(String txt) {
		if (this.level>= 1)
		System.out.println("INFO: "+ txt);
	}

	public void debug(String txt) {
		if (this.level>= 2)
		System.out.println("DEBUG: "+ txt);
	}

	public static void main(String[] args) {
		String er = "An error occured";
		String war = "This is a warning";
		String inf = "";
		String deb = "Debug";
		SingletonLogger testlog = SingletonLogger.getInstance();
		testlog.setLevel(-1);
		testlog.error(war);
		SingletonLogger derZweite = SingletonLogger.getInstance();
		derZweite.setLevel(-3);
		derZweite.debug(deb);
	}
}