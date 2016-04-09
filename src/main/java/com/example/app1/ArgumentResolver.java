package com.example.app1;

import java.io.InputStream;

public interface ArgumentResolver {
	Argument resolve(InputStream stream);
}
