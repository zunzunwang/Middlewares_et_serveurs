import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
 * Created by IntelliJ IDEA. 
 * User: zunzunwang
 * Date: 04/11/2015 
 * 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常 
 * 在三个项目中 两端都要对interface进行 Build path 操作
 * build path后 configuration build path 后加入projet
 */ 
public interface RemoteEcho extends Remote {
	/** 
	  * 简单的返回“Hello World！"字样 
	     * @return 返回“Hello World！"字样 
	     * @throws java.rmi.RemoteException 
	     */ 
	    public String Hello() throws RemoteException; 

	    /** 
	     * 一个简单的业务方法，根据传入的人名返回相应的问候语 
	     * @param s 传入的语句 
	     * @return 返回相应的问候语 
	     * @throws java.rmi.RemoteException 
	     */ 
	    public String Echo(String s) throws RemoteException; 
}

