package corporation.darkshadow.courster.Network;

import corporation.darkshadow.courster.pojo.Course;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by darkshadow on 4/3/18.
 */

public interface Medical {
    @GET("/medical.php")
    Call<Course> getCourses();
}
