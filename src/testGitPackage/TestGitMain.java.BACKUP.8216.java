package testGitPackage;

public class TestGitMain {

	public static void main(String[] args) {
		TestGitClass.method();
		AnotherClass.newMethod();
		//I am changing this comment in a branch
		//this is another comment

<<<<<<< HEAD
		//hotfix is different!
=======
		//this will change to create a merge conflict
>>>>>>> fix21
	}

}
