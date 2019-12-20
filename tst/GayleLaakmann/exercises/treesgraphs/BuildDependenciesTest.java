package GayleLaakmann.exercises.treesgraphs;

import GayleLaakmann.exercises.treesgraphs.graph.GraphNode;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BuildDependenciesTest {

    @Test
    void getBuildOrder() {
        GraphNode a = new GraphNode(0);
        GraphNode b = new GraphNode(0);
        GraphNode c = new GraphNode(0);
        GraphNode d = new GraphNode(0);
        GraphNode e = new GraphNode(0);
        GraphNode f = new GraphNode(0);
        List<GraphNode> projects = new ArrayList<>();
        projects.add(a);
        projects.add(b);
        projects.add(c);
        projects.add(d);
        projects.add(e);
        projects.add(f);
        BuildDependencies dependencies = new BuildDependencies();
        dependencies.getBuildOrder(projects, new GraphNode[][]{
                {a, d},
                {f, b},
                {b, d},
                {f, a},
                {d, c}
        });
        Assert.assertEquals(e, projects.get(0));
        Assert.assertEquals(f, projects.get(1));
        Assert.assertEquals(a, projects.get(2));
        Assert.assertEquals(b, projects.get(3));
        Assert.assertEquals(d, projects.get(4));
        Assert.assertEquals(c, projects.get(5));
    }
}