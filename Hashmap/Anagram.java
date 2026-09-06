import java.util.HashMap;
public class Anagram{
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){ //hence loop have O(n)
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1); //put and getOrDefault takes O(1)
        }

        for(int i=0;i<t.length();i++){ //O(m)
            char ch = t.charAt(i);
            if(map.get(ch)!=null){
               if(map.get(ch)==1){ //get,put O(1)
                map.remove(ch);
               }else{
                map.put(ch,map.get(ch)-1);
               }
            }else{
                return false;
            }
        }
        return map.isEmpty();//isEmpty() -> O(1) so total is O(n+m) if m==n like size of t and s is same then O(n+n)-> O(2n) -> O(n)(always true in majority cases)
    }//(if hasmap worst com is O(n) then get put,remove will O(n)) so two loops first n*O(n) and secnd n*O(n)-> total will O(n^2)-> but not possible here(this case)
    public static void main(String[] args) {
        String s = "race";
        String t = "care";
        System.out.println(isAnagram(s,t));
    }
}

