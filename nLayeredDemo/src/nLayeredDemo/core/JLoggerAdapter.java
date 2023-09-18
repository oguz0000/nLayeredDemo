package nLayeredDemo.core;

//import nLayeredDemo.JLogger.IJLogger;
import nLayeredDemo.JLogger.JLoggerManager;

public class JLoggerAdapter implements LoggerService {

	@Override
	public void log(String msj) {
		// TODO Auto-generated method stub
		JLoggerManager jLoggerManager= new JLoggerManager();
		jLoggerManager.log("JL ile loglandı");
	}

}
