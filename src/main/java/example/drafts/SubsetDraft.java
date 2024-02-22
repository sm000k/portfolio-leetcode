package example.drafts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetDraft {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for (int num : nums) {
            List<List<Integer>> newSubsets = new ArrayList();
            for (List<Integer> curr : output) {
                newSubsets.add(new ArrayList<Integer>(curr) {{
                    add(num);
                }});
            }
            for (List<Integer> curr : newSubsets) {
                output.add(curr);
            }
        }
        return output;
    }

    public List<List<Integer>> subsetsMoje(int[] nums) {
        List<List<Integer>> output = new ArrayList<>() {{
            add(new ArrayList<Integer>());
        }};

        for (int num : nums) {
            List<List<Integer>> subsets = new ArrayList<>();
            for (List<Integer> curr : output) {
                subsets.add(new ArrayList<Integer>(curr) {{
                    add(num);
                }});
            }
            for (List<Integer> curr : subsets) {
                output.add(curr);
            }
        }

        return output;
    }

    public static void main(String[] args) {

        SubsetDraft subsetDraft = new SubsetDraft();
        subsetDraft.subsets(new int[]{1, 2, 3});
        List<List<Integer>> lists = subsetDraft.subsetsMoje(new int[]{1, 2, 3});
        for(List<Integer> curr : lists){
            System.out.println(curr);
        }

        ArrayList<String> gfg = new ArrayList<String>() {
            {
                add("Geeks");
                add("for");
                add("Geeks");
            }
        };
    }


}

