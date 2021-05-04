package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json","rerun:target/rerun.txt"},//to do report
        features = "src/test/resources/features",//way how to run all test cases
  //      features = "src/test/resources/features/EtsySearchFunctionality.feature", //Path from Content Root(like Absolute path)
   //     glue = "/Users/nafisa/IdeaProjects/MindtekCucumberAutonation1/src/test/java/steps"
        //means glue go to the steps package and check all classes inside package
        glue = "steps",
        tags = "@regression",
        //Tags = "@smoke", //all smoke scenarios
        //Test UI regression test cases->"@regression and @ui",
        //Tags = "@HR-5 or @HR-6", //run only those feature files that has either @HR-5 or @HR-6 tag.
        //AND doesn't work: If put "@HR-5 AND @HR-6", //run only those feature files that has both @HR-5 or @HR-6 tags.-

      //   dryRun = true // if true it means not run steps, just check
         dryRun = false

)
public class Runner {


}
