# 🇺🇸 Practical Project


**CI/CD Pipeline for Dockerized Java Application using Jenkins**

**Tech Stack**:  Jenkins (Dockerized), Maven, Docker, GitHub, DockerHub

**Jenkins Plugins**: `credentials-binding`, `maven-plugin`, `docker-build-publish`, `junit`, `github`

## Description:

- Built a complete CI/CD pipeline for a Java application using Jenkins Freestyle Job.
- Automated the process: clone source from GitHub → build with Maven → run unit tests → package as Docker image → push to DockerHub.
- Used `credentials-binding` plugin to securely manage DockerHub credentials.
- Configured SCM trigger to automatically run the job on new commits.
- Managed Jenkins as a Docker container and handled all setup via Docker Compose.

## Outcome:

- Gained hands-on experience in building CI/CD pipelines with Jenkins and Docker.
- Mastered the end-to-end automation process from build to deployment using open-source DevOps tools.


---

# 🇻🇳 Dự án thực hành

**CI/CD Pipeline cho Ứng dụng Java với Docker và Jenkins**

**Công nghệ**: Jenkins (trên Docker), Maven, Docker, GitHub, DockerHub

**Jenkins Plugins**: `credentials-binding`, `maven-plugin`, `docker-build-publish`, `junit`, `github`

## Mô tả:

- Thiết lập một pipeline CI/CD cho ứng dụng Java đơn giản với Maven và Docker. 
- Sử dụng Jenkins Freestyle job để tự động hóa quy trình: clone mã nguồn từ GitHub → build với Maven → chạy test → đóng gói image Docker → đẩy image lên DockerHub. 
- Áp dụng `credentials-binding` để quản lý thông tin đăng nhập an toàn (DockerHub token). 
- Tự động kích hoạt build khi có commit mới bằng SCM trigger. 
- Quản lý plugin và môi trường Jenkins hoàn toàn trong Docker.

## Kết quả:

- Thành thạo thiết lập CI/CD pipeline thực tế với Jenkins và Docker. 
- Hiểu rõ cách đóng gói, build và deploy ứng dụng container hóa.

