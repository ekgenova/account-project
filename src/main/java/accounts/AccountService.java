package accounts;

import java.util.HashMap;

public class AccountService {
	
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
}
