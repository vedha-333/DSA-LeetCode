class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int numTeam = skill.length / 2 ;

        int totalSkills = 0 ;
        for (int nums : skill){
            totalSkills += nums ;
        }

        int target= totalSkills / numTeam;
        if (totalSkills % numTeam != 0){
            return -1 ;
        }

        long chemistry = 0 ;

        int left = 0 ;
        int right = skill.length -1 ;

        while (left < right){
            int sum = skill[left] + skill[right] ;

            if (sum == target){
                chemistry += (long) skill[left] * skill[right] ;
                left++;
                right--;
            }else {
                return -1;
            }
        }
        return chemistry ;
    }
}