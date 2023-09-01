public class Search_in_Rotated_Sorted_Array {
  //  function fot search key in Sorted Array
  public static int searchKeyS(int arr[], int key){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
      int mid = (start+end)/2;
      if(arr[mid] == key){
        return mid;
      }else{
        if(arr[mid]<key){
          start = mid+1;
        }else{
          end = mid-1;
        }
      }
    }
    return -1;
  }

  // function for search key in Rotated Sorted array using recursion
  public static int serachInRSArr(int arr[], int key, int si, int ei){
    // base case
    if(si>ei){
      return -1;
    }

    int mid = si +(ei-si)/2;
    // key found
    if(arr[mid]==key){
      return mid;
    }
    // key at line 1
    if(arr[si]<=arr[mid]){
      // case a:
      if(arr[si]<=key && key<=arr[mid]){
        return serachInRSArr(arr, key, si, mid-1);
      }
      // case b:
      else{
        return serachInRSArr(arr, key, mid+1, ei);
      }
      
    }
    // key at line 2
    else{
      // case c:
      if(arr[mid]<=key && key<=arr[ei]){
        return serachInRSArr(arr, key, mid+1, ei);
      }
      // case d:
      else{
        return serachInRSArr(arr, key, si, mid-1);
      }
    }
  }

  // function for search key in Rotated Sorted array using iteration
  public static int serachInRSArrI(int arr[], int key){
    int si = 0;
    int ei = arr.length-1;
    while(si<=ei){
      int mid = si + (ei-si)/2;
      if(arr[mid] == key){
        return mid;
      }

      if(arr[si]<=arr[mid]){
        if(arr[si]<=key && key<=arr[mid]){
          ei = mid-1;
        }else{
          si = mid+1;
        }
      }

      else{
        if(arr[mid]<=key && key<=arr[ei]){
          si = mid+1;
        }else{
          ei = mid-1;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[]={4,5,6,7,0,1,2};
    // System.out.println(searchKeyS(arr, 5));
    // System.out.println(serachInRSArr(arr, 5, 0, arr.length-1));
    System.out.println(serachInRSArrI(arr, 0));
  }
}
