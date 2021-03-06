import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;


/** 
 * Created by IntelliJ IDEA. 
 * User: zunzunwang
 * Date: 04/11/2015 
 * 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常 
 * 在三个项目中 两端都要对interface进行 Build path 操作
 * build path后 configuration build path 后加入projet
 */ 
public interface RemoteAnnuaire extends  Remote {
	/**  
	  * @return 表格中添加一个新的元素 
	  * @throws java.rmi.RemoteException 
	  */ 
    public void ajouterPersonne(Personne personne) throws RemoteException;
	/**  
	  * @return 表格中查找新的元素 
	  * @throws java.rmi.RemoteException 
	  */
    public Collection<Personne>chercherPersonne(String nom,String prenom) throws RemoteException;
	/**  
	  * @return 表格中打印所有元素 
	  * @throws java.rmi.RemoteException 
	  */
    public Collection<Personne> listePersonnes() throws RemoteException;
    
	/**  
	  * @return 表格中删除一个新的元素 
	  * @throws java.rmi.RemoteException 
	  */    
    public void supprimerPersonne(Personne personne) throws RemoteException;
}
