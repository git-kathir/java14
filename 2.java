class Solution {

public List<Integer> findDuplicates (int[] nums) {

HashMap<Integer, Integer> map = new HashMap<>();

for(int 1: nums){

if(map.containsKey(1)){

int count = map.get(1);

map.put(1, count+1);

}else{

map.put(1,1);

}

I

}

List<Integer> duplicates = new ArrayList();

for(int 1: map.keySet()){;

if (map.get(1) ==2){

duplicates.add(1);

}

}

return duplicates;
}
}

  
