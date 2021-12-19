package tech.jhipster.lite.generator.server.sonar.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.generator.project.domain.ProjectRepository;
import tech.jhipster.lite.generator.server.javatool.jacoco.domain.JacocoDomainService;
import tech.jhipster.lite.generator.server.javatool.jacoco.domain.JacocoService;
import tech.jhipster.lite.generator.server.sonar.domain.SonarDomainService;
import tech.jhipster.lite.generator.server.sonar.domain.SonarService;

@Configuration
public class SonarBeanConfiguration {

  private final ProjectRepository projectRepository;

  public SonarBeanConfiguration(ProjectRepository projectRepository) {
    this.projectRepository = projectRepository;
  }

  @Bean
  public SonarService jacocoService() {
    return new SonarDomainService(projectRepository);
  }
}
