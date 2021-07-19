package Practice_06_23_2021;

public class CategoryName {
    public static void main(String[] args) {
        String url="https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049";
        int startIndex=url.indexOf("c/");
        int endIndex=url.indexOf("?");

        String categoryName= url.substring(startIndex+2,endIndex);
        System.out.println("categoryName = " + categoryName);



        if (categoryName.contains("/")){
            categoryName.substring(0, categoryName.indexOf("/"));
        }

        categoryName= categoryName.replace("-"," ");
        System.out.println("categoryName = " + categoryName);

    }
}
/*
Task 4 : Assume that you searched a baby toy in Etsy.When you open related category your url is :

			    			"https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049"
			    									(main category)

						 According to this result print out main category name

						 Input :  https://www.etsy.com/c/toys-and-games/toys/baby-and-toddler-toys?ref=catnav-11049

						 Output:
						 			Main Category name is  toys and games

						 Input :  https://www.etsy.com/c/toys-and-entertainment?ref=catnav-11049
						 								     (main category)

						 Output:
						 			Main Category name is  toys and entertainment
 */