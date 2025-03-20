class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String result = "";
        String ch[] = path.split("/+");
        for(String ch1 : ch){
                if(ch1.trim().equals(".")){
                    continue;
                }
                else if(ch1.trim().equals("..")){
                    if(!st.empty())
                    st.pop();
                }
                else if(!ch1.trim().equals(""))
                st.push(ch1);
        }
       result= st.stream().map(x->x.toString()).collect(Collectors.joining("/"));
        System.out.println(result);
        return "/"+result;
    }
}