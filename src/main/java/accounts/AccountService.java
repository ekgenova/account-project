package accounts;

import java.util.HashMap;
import java.util.stream.*;
import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlSeeAlso(HashMap.class)
public class AccountService {
	
	@XmlElement
	protected HashMap<Integer, Account> accList = new HashMap();
	
	protected Integer key = 1;
	
	
	protected Integer generateKey() {
		return key++;
	}
	
	public void addAccount(Account account) {
		accList.put(generateKey(), account);
	}
		
	public Account getByKey(Integer key) {
		return accList.get(key);
	}
	
	public HashMap<Integer,Account> getHash(){
		return accList;
	}

	public int getNumAccountsByFirstName(String firstName) {
			return (int) accList.entrySet()
					.stream()
					.filter(a -> a.getValue().getFirstName().equalsIgnoreCase(firstName))
					.count();
	}
}
	
