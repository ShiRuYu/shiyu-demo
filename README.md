# 查看Git仓库
首先查看Git代码绑定了哪些Git仓库

git remote -v

# 添加远程仓库地址
git remote add origin https://xxx.git

# 绑定多个远端仓库
之后再绑定另外一个远端仓库，使Push的时候能同时Push多个仓库

git remote set-url --add origin http://xxx.git
git remote set-url --add origin http://xxx.git

# 强制覆盖远程仓库
远程分支上存在本地分支中不存在的提交
git push origin master -f