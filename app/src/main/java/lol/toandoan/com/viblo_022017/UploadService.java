package lol.toandoan.com.viblo_022017;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by ToanDoan on 2/21/2017.
 */
public interface UploadService {
    @POST("/")
    Call<ResponseBody> uploadFileMultilPart(@Body RequestBody files);
}
