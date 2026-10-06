class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking( k , n ,1, new ArrayList<>() , result);
        return result ;
    }

    public void backtracking (int size  , int target ,int index , List<Integer>current , List<List<Integer>> result  ){
        if (current.size() == size){
            if (target == 0 ){
                result.add(new ArrayList<>(current));
           }
           return ;
        }


        for (int i = index ; i <= 9 ; i++){
            if (i > target){
                break;
            }
            current.add(i);

            backtracking(size , target - i ,i + 1 , current , result );
            current.remove(current.size() -1 );
        }
    }
}