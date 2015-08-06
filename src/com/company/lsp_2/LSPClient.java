package com.company.lsp_2;

public class LSPClient {

    private void run(Ellipse e) throws Exception {
        Point a = new Point(1, 0);
        Point b = new Point(-1, 0);
        //if (e instanceof Ellipse) {
        e.setFoci(a, b);
        e.setMajorAxis(3);
        //} else {
        //    throw new Exception("Not a ellipse");
        //}

        // Post Conditions
        // Expect a (1,0) b (-1, 0)
        // Expect MajorAxis == 3
    }
}
