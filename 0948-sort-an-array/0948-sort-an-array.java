class Solution {
    public void divideAndMerge(int arr[], int s, int e) {
		if(s==e) return;
		int mid=(s+e)/2;
		divideAndMerge(arr, s, mid);
		divideAndMerge(arr, mid+1, e);
		merge(arr,s,mid,e);
	}
	
	public void merge(int arr[], int s, int mid, int e) {
		int alen=mid-s+1;
		int blen=e-mid;
		int a[]=new int[alen];
		int b[]=new int[blen];
		for(int i=s;i<=mid;i++) {
			a[i-s]=arr[i];
		}
		for(int j=mid+1;j<=e;j++) {
			b[j-mid-1]=arr[j];
		}
		int p1=0,p2=0,p3=s;
		while(p1<alen && p2<blen) {
			if(a[p1]<=b[p2]) {
				arr[p3++]=a[p1++];
			}
			else {
				arr[p3++]=b[p2++];
			}
		}
		while(p1<alen) {
			arr[p3++]=a[p1++];
		}
		while(p2<blen) {
			arr[p3++]=b[p2++];
		}
	}
    public int[] sortArray(int[] nums) {
      int N=nums.length;
			divideAndMerge(nums,0,N-1);
			return nums;
    }
}