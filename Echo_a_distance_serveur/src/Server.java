import java.rmi.AccessException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/** 
* Created by IntelliJ IDEA. 
* User: zunzunwang 
* Date: 04/11/2015 
* 创建RMI注册表，启动RMI服务，并将远程对象注册到RMI注册表中。 
*/ 

public class Server {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//本地主机上的远程对象注册表Registry的实例，并指定端口为18500.
			//这一步必不可少（Java默认端口是1099），必不可缺的一步，缺少注册表创建，
			//则无法绑定对象到远程注册表上
			Adresse adresse = null;
			Registry registry = LocateRegistry.createRegistry(adresse.port);
			//创建一个远程对象并且命名为 “echo”
			RemoteEchoImpl echo;
			echo = new RemoteEchoImpl();
			String rebindName =adresse.ID;
			//把远程对象注册到RMI注册服务器上，
			//注册时需要三个元素 1.端口号 2.远程的一个实例 3.实例的名字
			registry.rebind(rebindName, echo);
			System.out.println("Object Echo ok");
		}catch (AccessException e) {
			e.printStackTrace();
		}catch (RemoteException e){ 
		e.printStackTrace();
	   }
		

	}

}
