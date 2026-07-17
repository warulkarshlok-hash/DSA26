class Solution {
    public List<String> stringMatching(String[] words) {

    
        String str = String.join(" ", words);
        List<String> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            if(str.indexOf(words[i]) != str.lastIndexOf(words[i])){ 
        //IF INDEX ARE DIFFERENT OF FIRST OCCURENCE AND SECOND OCCRENCE MEANS THEY ARE SUBSTRING
                res.add(words[i]);
            }
        }
        return res;
    
        


        //4ms , 95%
    //     ArrayList<String> list = new ArrayList<>();
    //     for (int i = 0; i < words.length; i++) {
    //         for (int j = 0; j < words.length; j++) {
    //                 if (i != j && words[j].contains(words[i])) {
    //                 list.add(words[i]);
    //                 break;      // avoid duplicates
    //             }
    //         }
    //     }
    // return list;
    }
}