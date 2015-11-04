import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/** 
 * Created by IntelliJ IDEA. 
 * User: zunzunwang
 * Date: 04/11/2015
 * 远程的接口的实现 
 */ 


public class RemoteEchoImpl extends UnicastRemoteObject implements RemoteEcho {
	/** 
     * 因为UnicastRemoteObject的构造方法抛出了RemoteException异常，因此这里默认的构造方法必须写，必须声明抛出RemoteException异常
     * 
	 * @throws RemoteException 
	 */
	private static final long serialVersionUID = -7278596802637355415L;
	protected RemoteEchoImpl() throws RemoteException {
		super();
		}
	/** 
	 * 简单的返回“Hello World！"字样 
	 * 
	 * @return 返回“Hello World！"字样 
	 * @throws java.rmi.RemoteException 
	 */ 
	 public String Hello() throws RemoteException { 
	        return "Hello World!";
	        } 
	 /** 
	  * 一个简单的业务方法，根据传入的人名返回相应的问候语 
	  * 
	  * @param s 所传入的话 
	  * @return 返回相应的问候语 
	  * @throws java.rmi.RemoteException 
	  */ 
	 public String Echo(String s) throws RemoteException { 
	        return "bonjour:" + s + "(from MyComputer)"; 
	    } 
}
	
