import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    /*


     */

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combList=new ArrayList<>();
        function(target,new ArrayList<>(),candidates,0,combList);
        return combList;
    }
    static void function(int x,ArrayList<Integer> sumList,int[] candidates,int index,List<List<Integer>> list){
        if(x==0){
            sumList=new ArrayList<>(sumList);
            list.add(sumList);
        }
        else{
            sumList=new ArrayList<>(sumList);
            for(int i=0;i<candidates.length;i++){
                if(x - candidates[i]>=0 && index<= candidates[i]){
                    sumList.add(candidates[i]);
                    function(x-candidates[i],sumList,candidates,candidates[i],list);
                    sumList.remove(sumList.size()-1);
                }
            }
        }
    }
}