package lol.toandoan.com.viblo_022017;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by ToanDoan on 2/21/2017.
 */
public interface UploadService {
    @Multipart
    @POST("/")
    Call<ResponseBody> uploadFileMultilPart(@Part MultipartBody.Part[] file);
}
