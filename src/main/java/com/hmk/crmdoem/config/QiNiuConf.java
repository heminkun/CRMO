package com.hmk.crmdoem.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class QiNiuConf {
  @Value("${qi_niu.access_key}")
  private String accessKey;
  @Value("${qi_niu.secret_key}")
  private String secretKey;
  @Value("${qi_niu.bucket}")
  private String bucket;
  @Value("${qi_niu.cdn}")
  private String cdn;
  @Value("${qi_niu.zone}")
  private String zone;
  @Value("${qi_niu.prefix}")
  private String prefix;
}
