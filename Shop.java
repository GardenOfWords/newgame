package com.cn;
import java.util.*;
public class Shop
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String username=null;//存储登录或注册成功的用户名
		//声明数据源信息
		int[] uid=new int[10];
		String[] uname=new String[10];
		String[] password=new String[10];
		double[] money=new double[10];
		
		int[] gid=new int[10];
		String[] gname=new String[10];
		String[] place=new String[10];
		int[] number=new int[10];
		double[] price=new double[10];
		String[] type=new String[10];
		
		int[] bid=new int[10];//存储购买的商品编号
		int[] bnum=new int[10];
		
		//初始化数据
		uid[0]=1001;
		uname[0]="admin";
		password[0]="123456";
		money[0]=1000;
		
		gid[0]=1;
		gname[0]="TCL42吋液晶彩电";
		place[0]="CHINA";
		number[0]=10;
		price[0]=4200;
		type[0]="电器";
		
		gid[1]=2;
		gname[1]="海尔节能电冰箱";
		place[1]="CHINA";
		number[1]=10;
		price[1]=5200;
		type[1]="电器";
		
		gid[2]=3;
		gname[2]="西门子绿色洗衣机";
		place[2]="GERMA";
		number[2]=5;
		price[2]=6000;
		type[2]="电器";
		
		gid[3]=4;
		gname[3]="李宁运动球鞋";
		place[3]="CHINA";
		number[3]=10;
		price[3]=1200;
		type[3]="服饰";
		
		gid[4]=5;
		gname[4]="山东烟台苹果";
		place[4]="CHINA";
		number[4]=50;
		price[4]=10;
		type[4]="水果";
		
		System.out.println("----------------东莞商城--------------------");
		String ay=null;
		do
		{
			String an=null;
			String typeName=null;
			do
			{
				an="n";
				System.out.println("商品类型:");
				System.out.println("                  1.电器");
				System.out.println("                  2.服饰");
				System.out.println("                  3.水果");
				System.out.println("请选择:");
				int m=input.nextInt();
				if(m==1)
				{
					typeName="电器";
				}
				else if(m==2)
				{
					typeName="服饰";
				}
				else if(m==3)
				{
					typeName="水果";
				}
				else
				{
					System.out.println("输入错误，请重新选择!");
					an="y";
				}
			}while(an.equals("y"));
			String az=null;
			do
			{
				String aq=null;
				int id=0;
				do
				{
					aq="n";
					for(int i=0;i<10;i++)
					{
						if(gname[i]!=null&&type[i].equals(typeName))
						{
							System.out.println(gid[i]+"\t"+gname[i]+"\t"+place[i]+"\t"+number[i]+"\t"+price[i]);
						}
					}
					System.out.println("请输入要购买的商品编号:");
					id=input.nextInt();
					if(username==null)
					{
						System.out.println("您还没有登录，请登录或注册先!");
						String am=null;
						do
						{
							am="n";
							System.out.println("----------------------------------------------");
							System.out.println("                  1.登录");
							System.out.println("                  2.注册");
							System.out.println("请选择:");
							int n=input.nextInt();
							if(n==1)
							{
								String ac=null;
								do
								{
									ac="n";
									System.out.println("请输入用户名:");
									String name=input.next();
									System.out.println("请输入密  码:");
									String pwd=input.next();
									for(int i=0;i<10;i++)
									{
										if(uname[i]!=null)
										{
											if(uname[i].equals(name)&&password[i].equals(pwd))
											{
												username=name;
												break;
											}
										}
									}
									if(username!=null)
									{
										System.out.println("登录成功，欢迎用户"+username);
									}
									else
									{
										System.out.println("登录失败，请重新输入用户名和密码!!");
										ac="y";
									}
								}while(ac.equals("y"));
							}
							else if(n==2)
							{
								String ax=null;
								String name=null;
								do
								{
									ax="n";
									boolean isFlag=false;
									System.out.println("请输入用户名:");
									name=input.next();
									for(int i=0;i<10;i++)
									{
										if(uname[i]!=null)
										{
											if(uname[i].equals(name))
											{
												isFlag=true;
												break;
											}
										}
									}
									if(isFlag)
									{
										System.out.println("该用户名已被占用，请重新输入!");
										ax="y";
									}
								}while(ax.equals("y"));
								String as=null;
								String pwd=null;
								do
								{
									as="n";
									System.out.println("请输入密码:");
									pwd=input.next();
									if(pwd.length()<6)
									{
										System.out.println("密码长度不能少于六位，请重新输入!");
										as="y";
									}
								}while(as.equals("y"));
								String ap=null;
								String confPwd=null;
								do
								{
									ap="n";
									System.out.println("请输入确认密码:");
									confPwd=input.next();
									if(!confPwd.equals(pwd))
									{
										System.out.println("确认密码和密码不一致，请重新输入!");
										ap="y";
									}
								}while(ap.equals("y"));
								String ak=null;
								double my=0;
								do
								{
									ak="n";
									System.out.println("请输入确认注册金额:");
									my=input.nextDouble();
									if(my<100)
									{
										System.out.println("注册金额不能低于100元，请重新输入!");
										ak="y";
									}
								}while(ak.equals("y"));
								String ar=null;
								do
								{
										ar="n";
										double r=Math.random();
										int checkNum=(int)(r*10000);
										System.out.println("验证验:"+checkNum);
										System.out.println("请输入验证码:");
										int ck=input.nextInt();
										if(ck!=checkNum)
										{
											System.out.println("验证码输入错误，请重新输入!");
											ar="y";
										}
								}while(ar.equals("y"));
								for(int i=0;i<10;i++)
								{
									if(uname[i]==null)
									{
										uid[i]=uid[i-1]+1;
										uname[i]=name;
										password[i]=pwd;
										money[i]=my;
										break;
									}
								}
								username=name;
								System.out.println("注册成功，欢迎新用户"+username);
							}
							else
							{
								System.out.println("输入错误，请重新选择!");
								am="y";
							}
						}while(am.equals("y"));
					}
					boolean flag=false;
					for(int i=0;i<10;i++)
					{
						if(gname[i]!=null&&type[i].equals(typeName))
						{
							if(gid[i]==id)
							{
								flag=true;
								break;
							}
						}
					}
					if(flag==false)
					{
						System.out.println("输入错误，请重新选择!");
						aq="y";
					}
				}while(aq.equals("y"));
				int a=0;
				String al=null;
				do
				{
					al="n";
					boolean isCheck=false;
					System.out.println("请输入要购买的数量:");
					a=input.nextInt();
					for(int i=0;i<10;i++)
					{
						if(gid[i]==id)
						{
							if(number[i]<a)
							{
								isCheck=true;
							}
							else
							{
								number[i]=number[i]-a;
							}
							break;
						}
					}
					if(isCheck)
					{
						System.out.println("库存不足，请重新输入购买数量!");
						al="y";
					}
				}while(al.equals("y"));
				for(int i=0;i<10;i++)
				{
					if(bid[i]==0)
					{
						bid[i]=id;
						bnum[i]=a;
						break;
					}
				}
				System.out.println("请问您要继续购买"+typeName+"吗?");
				az=input.next();
			}while(az.equals("y"));
			System.out.println("请问您要继续购物吗?");
			ay=input.next();
		}while(ay.equals("y"));
		System.out.println("--------------您的本次购物清单----------------");
		for(int i=0;i<10;i++)
		{
			if(bid[i]!=0)
			{
				System.out.println(bid[i]+"\t"+bnum[i]);
			}
		}
		
	}
}