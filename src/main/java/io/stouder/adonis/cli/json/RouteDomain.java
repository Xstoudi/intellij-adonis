package io.stouder.adonis.cli.json;

import lombok.Getter;

import java.util.List;

@Getter
public class RouteDomain {
    private String domain;
    private List<Route> routes;
}
