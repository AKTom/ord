package rebue.ord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@ServletComponentScan("rebue")
@SpringCloudApplication
@EnableFeignClients(basePackages = {"rebue.onl.svr.feign", "rebue.kdi.svr.feign", "rebue.afc.svr.feign" })
public class OrdApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdApplication.class, args);
	}

}
