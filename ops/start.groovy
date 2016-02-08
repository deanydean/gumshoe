/**
 * Start the gumshoe agent.
 */
package gumshoe

GART.on("gumshoe.ready", {
    // Ready to start the gumshoe services
    GART.comm("srv.spy.start")
    GART.comm("srv.scout.start")
})

// Start the service loader
GART.comm("srv.loader.start", {
    // Start the graph service
    GART.comm("srv.graph.start", {
        GART.comm("gumshoe.ready")
    })
})

GART.join()
