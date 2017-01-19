package com.ww.framework;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 封装GZIP RESPONSE对象
 * @author Administrator
 *
 */
public class ParameterResponseWrapper extends HttpServletResponseWrapper {
	private GzipStream stream;
	private PrintWriter writer;
	protected int len;

	public ParameterResponseWrapper(HttpServletResponse response) throws IOException {
		super(response);
		stream = new GzipStream(response.getOutputStream());
	}

	public ParameterResponseWrapper(HttpServletResponse response, GzipStream stream)
			throws IOException {
		super(response);
		this.stream = stream;
	}

	public void setContentLength(int len) {
		this.len = len;
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		return stream;
	}

	public GzipStream getStream() {
		return stream;
	}

	public void setStream(GzipStream stream) {
		this.stream = stream;
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		if (writer == null) {
			writer = new PrintWriter(new OutputStreamWriter(getOutputStream(),
					getCharacterEncoding()));
		}
		return writer;
	}

	public void flush() throws IOException {
		if (writer != null) {
			writer.flush();
		}
		stream.finish();
	}

}