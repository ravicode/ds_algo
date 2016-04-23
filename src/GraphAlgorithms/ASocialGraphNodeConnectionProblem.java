package GraphAlgorithms;

/*
 code up a part of a social network were people were nodes and different types of connections existed between them. my job was to write functions to connect any two nodes of the graph, and also another function to check if 2 nodes are directly or indirectly(transitively) connected.
I asked him, whether all these edges/connections were directed or undirected, so he asked me to assume they were undirected for simplicity. Then i was asked to come up with a data structure to handle these operations. It was obvious that it was a graph structure and the nodes had user details and a edge-list inside it.
the socialGraph class had a insertion,deletion functions and connect(node*,node*) ,
isconnected(node*,node*) functions as friend functions to connect 2 nodes and check if 2 nodes are connected. connect function was straight forward ,as i had to append node reference to the edge-list of the node.
Then to check if 2 nodes are connected, i did a DFS from the source node to the destination node. The interviewer asked me to make the code such that it could scale. So i suggested that we could do a A* search instead of a DFS to make the search space smaller. The interviewer seemed satisfied with my solutions 
*
*/


public class ASocialGraphNodeConnectionProblem {

}
