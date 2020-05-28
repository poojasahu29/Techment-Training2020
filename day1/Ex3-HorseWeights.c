//Write a program to accept the weights of 3 horses and display the weight of the horse with maximum weight. If to horses are of same weight  and are best then should show message ,”Entered weights are not distinct values”

#include<stdio.h>
void main()
{
			int horse_weight1,horse_weight2,horse_weight3;
			printf("Enter the Three Horses Weight");
			scanf("%d%d%d",&horse_weight1,&horse_weight2,&horse_weight3);
			if(horse_weight1>horse_weight2)
				{
					if(horse_weight1>horse_weight3)
						printf("this Horse Weight is Maximum--%d\n",horse_weight1);
									
					else
						printf("this Horse Weight is Maximum-- %d\n",horse_weight3);
								
				}
			else
				{
					if(horse_weight2<horse_weight3)
						printf("this Horse Weight is Maximum-- %d\n",horse_weight3);
										
					else
						printf("this Horse Weight is Maximum --%d\n",horse_weight2);
										
				}
			if(horse_weight1==horse_weight2)
				{
					if(horse_weight1==horse_weight3)
						printf("Entered weights are not distinct values");
									
					else
						printf("Entered weights are  distinct values");
								
				}
			else
				{
					if(horse_weight2==horse_weight3)
						printf("Entered weights are not distinct values");										
					else
						printf("Entered weights are  distinct values");
										
				}
				
}

