1.打开文件夹命令
	cd ~ 当前用户主目录
	cd .. 返回上级目录
	cd - 进入目录
	cd / 打开根目录
	cd 目录/目录/
2.显示文件夹内容
	ls -a  显示所有包含隐藏文件
	ls -h  友好显示
	ls -l  显示详细信息（简写ll）
3.创建文件夹或者目录
	mkdir 目录 
	mkdir -p 目录  创建级联目录
4.删除文件夹或者目录
    rmdir 目录
	rmdir -p 目录  级联删除目录
5.清屏 clear  退出 ctrl+z(ctrl+d)
6.创建文件
	touch 文件名称  （touch abc.txt）
7.复制文件
	cp -r 源目录或者文件  新目录或者文件
	cp -ri 源目录或者文件  新目录或者文件 （覆盖之前做询问）
8.删除文件或者目录
	rm -rf 目录或者文件  （强制删除）
	rm -ri 目录或者文件   （询问删除）
9.移动，修改文件或者目录
	mv 目录1 目录2  （将目录1文件移动到目录2）
	mv 文件1名称  新文件名称  （修改文件名称）
10.编译文件
	vi 文件名称
	进入vi的命令模式
	输入i进入输入模式，进行输入信息
	编译完后按ESC+:进入底行模式
	输入wq正常保存退出（q正常不保存退出，wq!强制保存退出，q!强制不保存退出 ）
11.查看文件
    cat 文件名称	
12.分页查看
    more 文件名称
		空格：下一页
		回车：下一行
	less 文件名称
	    b向后翻一页
		q退出less命令
		y向前一行
		空格：下一页
		回车：下一行
		pagedown：下一页
		pageup:上一页
13.查看末尾几行文件
		tail -n 文件名称
		tail -c n 文件名称（显示后几个字符）
		tail -f  文件名称（动态显示）
14.解压打包命令
		tar -cvf:打包成一个文件或者目录 ./*
		tar -zcvf：压缩打包一个tar

	
