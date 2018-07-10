package accounts;

import java.util.HashMap;

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
			int total = 0;
			
			for (Account acc: accList.values()) {
				if(acc.getFirstName().equalsIgnoreCase(firstName)) {
					total++;
				}
			}
			
		return total;
	}
}
	
