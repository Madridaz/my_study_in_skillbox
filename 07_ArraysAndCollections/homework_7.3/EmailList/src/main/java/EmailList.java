import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
  
TreeSet<String> emailList = new TreeSet<>();
  public void add(String email) {
    // TODO: валидный формат email добавляется
    
    emailList.add(email);
    
  }

  public List<String> getSortedEmails() {
    // TODO: возвращается список электронных адресов в алфавитном порядке
    	for(String s: emailList) {
        System.out.print(s.toLowerCase());
        System.out.println();
        }
        
    
    return Collections.emptyList();
  }
}
