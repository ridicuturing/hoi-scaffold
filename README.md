# springboot项目初始化

### 一键启动（docker compose）
拉取项目后，在项目目录下使用docker-compose启动
```bash
docker compose -p hoi-scaffold -f docker/docker-compose.yml up -d
```

不想拉取项目的话，也可以直接复制[docker-compose](/docker/docker-compose.yml)文件到本地，然后用docker-compose启动
```bash
docker compose -p hoi-scaffold -f docker-compose.yml up -d
```
### 引用

- Spring Data JPA
- Spring Web
- lombok
- hutool

### 各功能模块

| 模块     | 作用                     |
|--------|------------------------|
| start | 项目启动模块                 |
| web | 提供http接口和与web相关的配置模块   |
| service | 业务模块                   |
| repository | 持久层模块                  |
| channel | 对外交互模块，比如openai的http交互 |


