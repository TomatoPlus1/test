
public class Info {
	// git is used for version control, useful when a group of people is working
	// on a project
	// go to github.com after installing git bash
	// to use git bash, run it, type in : git config --global user.name
	// "username". and : git config --global user.email "email"
	// the the things above to log in in git bash

	// use cd "path of folder of code" to load folder in git bash
	// then use git init to place a .git folder in that path
	// then type git remote add origin, then the .git url created on the github
	// website when you pressed create new repository, this is basically making
	// our git talk to the github
	// git add -A, this moves all files that have been edited into the staging
	// area
	// git status just shows status
	// git -m "Initial add to repository", this adds file to local machine
	// git push -u origin master, this now connects to the Internet and add file
	// to the repository, which now people can access online

	// to restate...
	// 1.Initializing
	// git init
	// git remote add origin "github_link"
	// 2.Push code to github
	// git add -A
	// git commit -m "message here"
	// git push origin master

	// you can also clone or download files that others has.
	// to clone you need to state path in quotes, git init, and then git clone
	// "url"
	// for download just download as zip

	// to update a file, go state the path of the work folder where a .git file
	// should be, git status, and that will say that you modified your file (if
	// you did)
	// and to add those changes to the repository, just type git add-A and then
	// git status again, that should say something has been modified..
	// then you should type git commit -m "whatever as documentation" in quotes
	// and now you can check using status, but it should say that the local
	// repository is up to date. Now you can finally push that file again to the
	// repository with git push origin master.

	//writing from git hub, after stating location, you should be able to write 
	//git pull and pull new edits from github
}
