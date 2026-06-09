class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> ls = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap<>();

        for(String st : strs){
            char[] c = st.toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            if(!map.containsKey(a)){
                map.put(a, new ArrayList<String>());
            }
            map.get(a).add(st);
        }

        for(Map.Entry<String, List<String>> e : map.entrySet()){
            ls.add(e.getValue());
        }
        return ls;
    }
}
