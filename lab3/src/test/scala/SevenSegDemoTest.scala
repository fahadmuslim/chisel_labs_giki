import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec

class SevenSegDemoTest extends AnyFlatSpec with ChiselScalatestTester {
	"SevenSegTest " should "pass" in {
		test(new SevenSegDemo).withAnnotations(Seq(WriteVcdAnnotation)) { dut =>
			dut.clock.step(100)
		}
	}
}
