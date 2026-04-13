class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");

        List<String> list = new ArrayList<>();
        for (String part : parts ){
            if (part.equals("") || part.equals(".")){
                continue ;
            }else if (part.equals("..")){
                if(!list.isEmpty()){
                    list.remove(list.size() -1 );               
                }
            }else {
                list.add(part);
            }
        }
        return "/" + String.join("/" , list);
    }
}