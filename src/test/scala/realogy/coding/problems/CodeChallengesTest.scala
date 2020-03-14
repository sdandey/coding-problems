package realogy.coding.problems

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CodeChallengesTest extends FunSuite {

  test("test valid common suffixes") {
    assert("hello" == CodeChallenges().commonSuffix("hello","santoshhello").right.get)
    assert("ble" == CodeChallenges().commonSuffix("impossible","able").right.get)
  }

  test("test common suffixes with uppercase") {
    assert("mily" == CodeChallenges().commonSuffix("FAMILY","I'm Emily").right.get)
  }

  test("test common suffixes  with trailing spaces") {
    assert("ify" == CodeChallenges().commonSuffix("classify ","Examplify").right.get)
    assert("ify" == CodeChallenges().commonSuffix(" classify"," Examplify ").right.get)

  }

  test("test empty string") {
    assert(CodeChallenges().commonSuffix(" ","santoshhello").isLeft)
    assert(CodeChallenges().commonSuffix("Cooling","").isLeft)
  }
}
