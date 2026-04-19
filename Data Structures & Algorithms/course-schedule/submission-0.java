class Solution {
    Map<Integer, List<Integer>> preMap = new HashMap();
    Set<Integer> visited = new HashSet();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            preMap.get(prereq[0]).add(prereq[1]);
        }

        for(int i = 0; i< numCourses; i++){
            if(!dfs(i)){
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int crs){
        if(visited.contains(crs)) return false;

        if(preMap.get(crs).isEmpty()) return true;

        visited.add(crs);

        for(int i : preMap.get(crs)){
            if(!dfs(i)){
                return false;
            }
        }

        visited.remove(crs);
        preMap.put(crs, new ArrayList());
        return true;
    }
}
