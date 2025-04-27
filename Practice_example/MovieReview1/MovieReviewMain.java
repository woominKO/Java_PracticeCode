public class MovieReviewMain {
    public static void main(String[] args){
        MovieReview review1 = new MovieReview();
        review1.review="노잼";
        review1.title="주글래살래";

        MovieReview review2 = new MovieReview();
        review2.review ="꿀잼";
        review2.title = "킬러들의쇼핑몰";

        MovieReview[] reviews = {review1, review2};

        for (MovieReview r : reviews){
            System.out.println("영화제목:  "+ r.title +" , " +"리뷰:  "+ r.review);
        }
    }
}
