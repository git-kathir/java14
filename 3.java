lass Solution (

public int[] findIntersectionValues(int[] nums1, int[] nums2) {

Set<Integer> set1 = new HashSet<>();

Set<Integer> set2 = new HashSet();

for(int 1: nums1){

set2.add(1);
}

for(int 1: nums2) [ set1.add(1);

} int count1= 0; for(int 1: nums1) ( if(seti.contains(1)){ 
count1++;
}

}

int count2=0;

for (int 1: nums2)( if(set2.contains(1)){
count2++;
}

}

return new int[]{count1, count2};
}
}
