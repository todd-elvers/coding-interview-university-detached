package te.interview.prep.trees_graphs

class GraphBreadthFirstSearchPrinterTest extends DirectedGraphTest {

    GraphBreadthFirstSearchPrinter breadthFirstSearch = []

    def "can print nodes in BFS order"() {
        when:
            String visitOrder = breadthFirstSearch.search(graph)

        then:
            visitOrder == "A,X,L,B,Y,M,N,D,C,Z,E,"
    }
}