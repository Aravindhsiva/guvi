#include<stdio.h>
void main()
{
int i,n,j;
scanf("%d",&n);
int a[n];
for(i=0;i<n;i++)
scanf("%d",&a[i]);
for(i=0;i<n-1;i++)
{
for(j=1;j<n;j++)
{
if(a[i]==a[j])
{
printf("%d",a[i]);
exit(0);
}
}
if(i==n-20
printf("unique");
}
}
