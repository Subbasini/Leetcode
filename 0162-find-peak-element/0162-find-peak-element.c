int findPeakElement(int a[], int numsSize) {
    int peak=a[0];
    int peakindex=0;
    int i;
     for(i=0;i<numsSize;i++){
         if((i == 0 || a[i] > a[i - 1]) && 
            (i == numsSize - 1 || a[i] > a[i + 1])){
             peak=a[i];
             return i;
         }
       
       
     }  return -1;
     
}
// int main(){
//     int a[]={1,2,3,4};
//     int numsSize=sizeof(a)/sizeof(a[0]);
//     int peakindex=findPeakElement(a,numsSize);
//     printf("peak element is %d at index %d\n",a[peakindex],peakindex);
//     return 0;
// }